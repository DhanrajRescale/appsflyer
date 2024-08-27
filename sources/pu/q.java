package pu;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class q implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31433a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31434b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f31435c;

    public q(int i10, Function1 transformer, Sequence sequence) {
        this.f31433a = i10;
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(sequence, "sequence");
            Intrinsics.checkNotNullParameter(transformer, "predicate");
            this.f31434b = sequence;
            this.f31435c = transformer;
            return;
        }
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f31434b = sequence;
        this.f31435c = transformer;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f31433a) {
            case 0:
                return new e(this);
            case 1:
                return new r(this);
            default:
                return new g(this);
        }
    }

    public q(Function0 getInitialValue, Function1 getNextValue) {
        this.f31433a = 2;
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f31434b = getInitialValue;
        this.f31435c = getNextValue;
    }
}
