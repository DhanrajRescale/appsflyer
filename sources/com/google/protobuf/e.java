package com.google.protobuf;

/* loaded from: classes2.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public int f11901a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f11902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f11903c;

    public e(h hVar) {
        this.f11903c = hVar;
        this.f11902b = hVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11901a < this.f11902b;
    }
}
