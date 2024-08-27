package lp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class j0 extends s implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f24996a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24997b;

    public j0(Object obj, Object obj2) {
        this.f24996a = obj;
        this.f24997b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f24996a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24997b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
