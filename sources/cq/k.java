package cq;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final k f13068a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f13069b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k[] f13070c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cq.k] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f13068a = r02;
        f13070c = new k[]{r02};
        f13069b = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f13070c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f13069b.post(runnable);
    }
}
