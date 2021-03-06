package org.ms.webrtc;

/**
 * Created by dds on 2019/7/26.
 * ddssingsong@163.com
 */
public interface IMEvent {


    void onOpen();

    // 初始化信息
    void init(boolean status,String res);

    void loginSuccess(String userId, String avatar);

    //
    void onInvite(String room, boolean audioOnly, String inviteId, String userList);

    // 取消
    void onCancel(String inviteId);

    //
    void onRing(String userId);

    void onPeers(String myId, String userList);

    void onNewPeer(String myId);

    void onReject(String userId, int type);

    // onOffer
    void onOffer(String userId, String sdp);

    // onAnswer
    void onAnswer(String userId, String sdp);

    // ice-candidate
    void onIceCandidate(String userId, String id, int label, String candidate);

    void onLeave(String userId);

    void logout(String str);

    void onTransAudio(String userId);

    void onDisConnect(String userId);

    void reConnect();

}
