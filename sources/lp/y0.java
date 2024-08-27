package lp;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class y0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f25085a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0[] f25086b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lp.y0] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f25085a = r02;
        f25086b = new y0[]{r02};
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) f25086b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
