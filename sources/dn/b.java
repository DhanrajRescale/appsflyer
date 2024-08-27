package dn;

import android.os.Handler;
import android.os.Looper;
import iu.k;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class b extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f14422a = new k(0);

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
