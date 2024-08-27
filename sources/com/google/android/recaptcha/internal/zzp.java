package com.google.android.recaptcha.internal;

import el.l;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import qu.f1;
import qu.i2;
import qu.r0;
import vu.f;
import vu.u;
import xu.e;
import yk.g;

/* loaded from: classes2.dex */
public final class zzp {

    @NotNull
    public static final zzp zza = new zzp();

    @NotNull
    private static final f0 zzb;

    @NotNull
    private static final f0 zzc;

    @NotNull
    private static final f0 zzd;

    static {
        i2 l10 = l.l();
        e eVar = r0.f32255a;
        zzb = new f(l10.l(u.f38408a));
        final AtomicInteger atomicInteger = new AtomicInteger();
        f d10 = hl.f.d(new f1(Executors.newScheduledThreadPool(1, new ThreadFactory() { // from class: qu.l2

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f32234a = 1;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f32235b = "reCaptcha";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                int i10 = this.f32234a;
                String str = this.f32235b;
                if (i10 != 1) {
                    str = str + '-' + atomicInteger.incrementAndGet();
                }
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(true);
                return thread;
            }
        })));
        g.H(d10, null, null, new zzo(null), 3);
        zzc = d10;
        zzd = hl.f.d(r0.f32256b);
    }

    private zzp() {
    }

    @NotNull
    public static final f0 zza() {
        return zzd;
    }

    @NotNull
    public static final f0 zzb() {
        return zzb;
    }

    @NotNull
    public static final f0 zzc() {
        return zzc;
    }
}
