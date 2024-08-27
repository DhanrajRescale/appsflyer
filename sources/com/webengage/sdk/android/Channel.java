package com.webengage.sdk.android;

import com.google.android.gms.common.Scopes;

/* loaded from: classes2.dex */
public enum Channel {
    PUSH("push", q0.f12652k.toString()),
    SMS("sms", q0.f12653l.toString()),
    EMAIL(Scopes.EMAIL, q0.f12654m.toString()),
    IN_APP("in_app", "opt_in_inapp"),
    WHATSAPP("whatsapp", q0.f12655n.toString());

    private String channel;
    private String userAttributesKey;

    Channel(String str, String str2) {
        this.channel = str;
        this.userAttributesKey = str2;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getUserAttributeKey() {
        return this.userAttributesKey;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.userAttributesKey;
    }
}
