package pt;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class q extends at.l {

    /* renamed from: c, reason: collision with root package name */
    public static final t f31391c = new t("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f31392b = f31391c;

    @Override // at.l
    public final at.k a() {
        return new r(this.f31392b);
    }
}
