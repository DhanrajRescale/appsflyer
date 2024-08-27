package l8;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final i f24230a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f24231b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l8.i] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f24230a = r02;
        f24231b = new i[]{r02};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f24231b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
