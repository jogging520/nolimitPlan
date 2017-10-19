package com.cmcc.gs.service;

import com.alibaba.fastjson.JSONObject;

import java.net.ProtocolException;

public interface PostService {

    public String postJson(JSONObject json, String url) throws ProtocolException;
}
