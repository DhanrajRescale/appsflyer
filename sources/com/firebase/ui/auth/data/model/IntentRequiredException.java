package com.firebase.ui.auth.data.model;

import android.content.Intent;
import com.firebase.ui.auth.FirebaseUiException;

/* loaded from: classes.dex */
public class IntentRequiredException extends FirebaseUiException {

    /* renamed from: b, reason: collision with root package name */
    public final Intent f10899b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10900c;

    public IntentRequiredException(int i10, Intent intent) {
        super(0);
        this.f10899b = intent;
        this.f10900c = i10;
    }
}
