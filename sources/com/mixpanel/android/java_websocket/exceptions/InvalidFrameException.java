package com.mixpanel.android.java_websocket.exceptions;

import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* loaded from: classes2.dex */
public class InvalidFrameException extends InvalidDataException {
    private static final long serialVersionUID = -9016496369828887591L;

    public InvalidFrameException() {
        super(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);
    }

    public InvalidFrameException(String str) {
        super(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, str);
    }
}
