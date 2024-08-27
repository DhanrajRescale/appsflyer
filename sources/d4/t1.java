package d4;

import android.view.ViewGroup;
import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class t1 implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13831a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13832b;

    public /* synthetic */ t1(Object obj, int i10) {
        this.f13831a = i10;
        this.f13832b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Iterator, yt.a, java.lang.Object, pu.h] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        int i10 = this.f13831a;
        Object obj = this.f13832b;
        switch (i10) {
            case 0:
                return new t.m0((ViewGroup) obj, 2);
            case 1:
                return zq.f.U((Object[]) obj);
            case 2:
                return ((Iterable) obj).iterator();
            case 3:
                return new fu.l(this);
            case 4:
                Function2 block = (Function2) obj;
                Intrinsics.checkNotNullParameter(block, "block");
                ?? obj2 = new Object();
                obj2.f31430d = zt.f.a(obj2, obj2, block);
                return obj2;
            default:
                return (Iterator) obj;
        }
    }

    public t1(BufferedReader reader) {
        this.f13831a = 3;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f13832b = reader;
    }
}
