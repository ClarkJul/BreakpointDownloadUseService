package com.example.clark.breakpointdownloaduseservice;

/**
 * Author by Clark, Date on 2018/10/14.
 * PS: Not easy to write code, please indicate.
 */
public interface DownloadListener {
    void onProgress(int progress);//通知当前下载进度

    void onSuccess();//通知下载完成

    void onFailed();//通知下载失败

    void onPaused();//通知下载暂停

    void onCanceled();//通知下载取消
}
