package pu;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import t.m0;

/* loaded from: classes2.dex */
public final class b implements Sequence, c {

    /* renamed from: a, reason: collision with root package name */
    public final Sequence f31414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31415b;

    public b(Sequence sequence, int i10) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f31414a = sequence;
        this.f31415b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // pu.c
    public final Sequence a(int i10) {
        int i11 = this.f31415b + i10;
        if (i11 < 0) {
            return new b(this, i10);
        }
        return new b(this.f31414a, i11);
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new m0(this);
    }
}
