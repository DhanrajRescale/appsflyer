package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11671b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f11670a = i10;
        this.f11671b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f11670a;
        Object obj = this.f11671b;
        switch (i10) {
            case 0:
                return UserMetadata.SerializeableKeysMap.a((UserMetadata.SerializeableKeysMap) obj);
            default:
                return UserMetadata.a((UserMetadata) obj);
        }
    }
}
