package kotlin.text;

import d4.t1;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class e extends vt.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f23407a;

    public e(f fVar) {
        this.f23407a = fVar;
    }

    @Override // vt.b
    public final int b() {
        return this.f23407a.f23408a.groupCount() + 1;
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null && !(obj instanceof MatchGroup)) {
            return false;
        }
        return super.contains((MatchGroup) obj);
    }

    public final MatchGroup e(int i10) {
        f fVar = this.f23407a;
        Matcher matcher = fVar.f23408a;
        IntRange k10 = kotlin.ranges.d.k(matcher.start(i10), matcher.end(i10));
        if (Integer.valueOf(k10.f23381a).intValue() >= 0) {
            String group = fVar.f23408a.group(i10);
            Intrinsics.checkNotNullExpressionValue(group, "group(...)");
            return new MatchGroup(group, k10);
        }
        return null;
    }

    @Override // vt.b, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        IntRange e10 = vt.y.e(this);
        Intrinsics.checkNotNullParameter(e10, "<this>");
        return pu.p.g(new t1(e10, 2), new d(this)).iterator();
    }
}
