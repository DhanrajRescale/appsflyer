package ft;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c implements ht.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c f16242a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f16243b;

    /* JADX WARN: Type inference failed for: r0v0, types: [ft.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ft.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f16242a = r02;
        f16243b = new c[]{r02, new Enum("NEVER", 1)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f16243b.clone();
    }

    @Override // ct.b
    public final void a() {
    }

    @Override // ht.c
    public final void clear() {
    }

    @Override // ht.b
    public final int d() {
        return 2;
    }

    @Override // ht.c
    public final Object i() {
        return null;
    }

    @Override // ht.c
    public final boolean isEmpty() {
        return true;
    }

    @Override // ht.c
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
