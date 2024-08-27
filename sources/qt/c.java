package qt;

import yk.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c implements gv.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c f32175a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f32176b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qt.c] */
    static {
        ?? r02 = new Enum("CANCELLED", 0);
        f32175a = r02;
        f32176b = new c[]{r02};
    }

    public static boolean a(gv.a aVar, gv.a aVar2) {
        if (aVar2 == null) {
            g.M(new NullPointerException("next is null"));
            return false;
        }
        if (aVar != null) {
            aVar2.cancel();
            g.M(new IllegalStateException("Subscription already set!"));
            return false;
        }
        return true;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32176b.clone();
    }

    @Override // gv.a
    public final void cancel() {
    }

    @Override // gv.a
    public final void request() {
    }
}
