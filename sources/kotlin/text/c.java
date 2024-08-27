package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public final class c implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f23402a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23403b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23404c;

    /* renamed from: d, reason: collision with root package name */
    public final Function2 f23405d;

    public c(CharSequence input, int i10, int i11, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f23402a = input;
        this.f23403b = i10;
        this.f23404c = i11;
        this.f23405d = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new b(this);
    }
}
