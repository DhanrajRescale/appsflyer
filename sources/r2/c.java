package r2;

import android.text.Layout;
import android.text.TextPaint;
import j2.g0;
import j2.r;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Pair;
import t0.s;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f33026a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f33027b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33028c;

    /* renamed from: d, reason: collision with root package name */
    public final List f33029d;

    /* renamed from: e, reason: collision with root package name */
    public final o2.r f33030e;

    /* renamed from: f, reason: collision with root package name */
    public final w2.b f33031f;

    /* renamed from: g, reason: collision with root package name */
    public final d f33032g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f33033h;

    /* renamed from: i, reason: collision with root package name */
    public final k2.h f33034i;

    /* renamed from: j, reason: collision with root package name */
    public h.c f33035j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f33036k;

    /* renamed from: l, reason: collision with root package name */
    public final int f33037l;

    /* JADX WARN: Code restructure failed: missing block: B:117:0x03c4, code lost:
    
        if (w2.m.a(r8, yk.j.e1(0)) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x008c, code lost:
    
        if (r7 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x009a, code lost:
    
        if (r7 == 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02f4, code lost:
    
        if (yk.j.g1(r8.f20723b.f20757c) == false) goto L150;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(j2.g0 r44, o2.r r45, w2.b r46, java.lang.String r47, java.util.List r48, java.util.List r49) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.c.<init>(j2.g0, o2.r, w2.b, java.lang.String, java.util.List, java.util.List):void");
    }

    @Override // j2.r
    public final boolean a() {
        h.c cVar = this.f33035j;
        if (cVar != null && cVar.K()) {
            return true;
        }
        if (!this.f33036k && hl.f.p(this.f33027b)) {
            kq.e eVar = g.f33048a;
            g.f33048a.getClass();
            Object obj = q4.a.f31656a;
        }
        return false;
    }

    @Override // j2.r
    public final float b() {
        k2.h hVar = this.f33034i;
        if (!Float.isNaN(hVar.f21933e)) {
            return hVar.f21933e;
        }
        TextPaint textPaint = hVar.f21930b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = hVar.f21929a;
        lineInstance.setText(new k2.c(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new s(2));
        int i10 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i10), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f23354b).intValue() - ((Number) pair.f23353a).intValue() < next - i10) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i10), Integer.valueOf(next)));
                }
            }
            i10 = next;
        }
        Iterator it = priorityQueue.iterator();
        float f10 = s0.g.f34069a;
        while (it.hasNext()) {
            Pair pair2 = (Pair) it.next();
            f10 = Math.max(f10, Layout.getDesiredWidth(charSequence, ((Number) pair2.f23353a).intValue(), ((Number) pair2.f23354b).intValue(), textPaint));
        }
        hVar.f21933e = f10;
        return f10;
    }

    @Override // j2.r
    public final float c() {
        return this.f33034i.b();
    }
}
