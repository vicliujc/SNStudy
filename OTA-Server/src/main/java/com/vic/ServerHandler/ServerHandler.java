package com.vic.ServerHandler;


import java.util.Date;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ServerHandler extends ChannelInboundHandlerAdapter {

	 @Override
	    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
	        //ctx.fireChannelRead(msg);
	        ByteBuf buf=(ByteBuf) msg;
	        byte[] req=new byte[buf.readableBytes()];
	        buf.readBytes(req);
	        for (byte b : req) {
				System.out.println(new Date().toLocaleString()+" "+b);
			}
	    }
}
