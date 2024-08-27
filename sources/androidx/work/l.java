package androidx.work;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final l f2626a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l[] f2627b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.work.l] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f2626a = r02;
        f2627b = new l[]{r02};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f2627b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
