package yd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f41540b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f41541c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f41542d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f41543e;

    /* renamed from: a, reason: collision with root package name */
    public final String f41544a;

    static {
        f fVar = new f("Report", 0, "Report Message");
        f41540b = fVar;
        f fVar2 = new f("Delete", 1, "Delete Message");
        f41541c = fVar2;
        f fVar3 = new f("Forward", 2, "Forward Message");
        f41542d = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3, new f("Pin", 3, "Pin Message"), new f("Reply", 4, "Reply")};
        f41543e = fVarArr;
        zq.f.E(fVarArr);
    }

    public f(String str, int i10, String str2) {
        this.f41544a = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f41543e.clone();
    }
}
