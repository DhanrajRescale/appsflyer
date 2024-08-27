package oq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f30257a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f30258b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f30259c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f30260d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f30261e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f30262f;

    /* JADX WARN: Type inference failed for: r0v0, types: [oq.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [oq.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [oq.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [oq.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [oq.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ATTEMPT_MIGRATION", 0);
        f30257a = r02;
        ?? r12 = new Enum("NOT_GENERATED", 1);
        f30258b = r12;
        ?? r22 = new Enum("UNREGISTERED", 2);
        f30259c = r22;
        ?? r32 = new Enum("REGISTERED", 3);
        f30260d = r32;
        ?? r42 = new Enum("REGISTER_ERROR", 4);
        f30261e = r42;
        f30262f = new c[]{r02, r12, r22, r32, r42};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f30262f.clone();
    }
}
