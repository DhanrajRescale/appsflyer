package com.mixpanel.android.java_websocket.exceptions;

import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* loaded from: classes2.dex */
public class InvalidHandshakeException extends InvalidDataException {
    private static final long serialVersionUID = -1426533877490484964L;

    public InvalidHandshakeException() {
        super(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE);
    }

    public InvalidHandshakeException(String str) {
        super(CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE, str);
    }
}
