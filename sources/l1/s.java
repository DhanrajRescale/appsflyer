package l1;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final s f23918a;

    /* renamed from: b, reason: collision with root package name */
    public static final s f23919b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f23920c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ s[] f23921d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l1.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l1.s] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l1.s] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l1.s] */
    static {
        ?? r02 = new Enum("Active", 0);
        f23918a = r02;
        ?? r12 = new Enum("ActiveParent", 1);
        f23919b = r12;
        ?? r22 = new Enum("Captured", 2);
        ?? r32 = new Enum("Inactive", 3);
        f23920c = r32;
        f23921d = new s[]{r02, r12, r22, r32};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f23921d.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
