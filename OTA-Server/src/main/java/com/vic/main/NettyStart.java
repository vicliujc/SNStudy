package com.vic.main;

import com.vic.ServerHandler.ServerHandler;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class NettyStart {
	private int port;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void start() throws Exception{
		EventLoopGroup bossGroup=new NioEventLoopGroup();
		EventLoopGroup workGroup=new NioEventLoopGroup();
		
		try {
			ServerBootstrap sb=new ServerBootstrap();
			sb.group(bossGroup,workGroup)
			.channel(NioServerSocketChannel.class)
			.option(ChannelOption.SO_BACKLOG, 1000)
            .option(ChannelOption.SO_REUSEADDR, true)
            .childHandler(new ChannelInitializer<Channel>() {
            	@Override
            	public void initChannel(Channel ch) throws Exception{
            		ch.pipeline().addLast(new ServerHandler());
            	}
			});
			
			
			ChannelFuture future=sb.bind(port).sync();
			System.out.println("开始监听:"+port);
			
		} finally {
			// TODO: handle finally clause
			workGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
		
	}

}
