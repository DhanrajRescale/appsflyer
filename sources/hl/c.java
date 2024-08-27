package hl;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f18600a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f18601b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f18602c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hl.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hl.c] */
    static {
        ?? r02 = new Enum("MTML_INTEGRITY_DETECT", 0);
        f18600a = r02;
        ?? r12 = new Enum("MTML_APP_EVENT_PREDICTION", 1);
        f18601b = r12;
        f18602c = new c[]{r02, r12};
    }

    public static c valueOf(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (c) Enum.valueOf(c.class, value);
    }

    public static c[] values() {
        return (c[]) Arrays.copyOf(f18602c, 2);
    }

    public final String a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "integrity_detect";
    }

    public final String b() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "MTML_INTEGRITY_DETECT";
    }
}
