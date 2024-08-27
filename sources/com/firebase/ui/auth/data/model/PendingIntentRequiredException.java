package com.firebase.ui.auth.data.model;

import android.app.PendingIntent;
import com.firebase.ui.auth.FirebaseUiException;

/* loaded from: classes.dex */
public class PendingIntentRequiredException extends FirebaseUiException {

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f10901b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10902c;

    public PendingIntentRequiredException(int i10, PendingIntent pendingIntent) {
        super(0);
        this.f10901b = pendingIntent;
        this.f10902c = i10;
    }
}
