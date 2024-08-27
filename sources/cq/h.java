package cq;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final h f13057a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f13058b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cq.h] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f13057a = r02;
        f13058b = new h[]{r02};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f13058b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
