package j2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f20675a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20676b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f20677c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20678d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f20679e;

    public c() {
        this.f20675a = new StringBuilder(16);
        this.f20676b = new ArrayList();
        this.f20677c = new ArrayList();
        this.f20678d = new ArrayList();
        this.f20679e = new ArrayList();
    }

    public final void a(b0 b0Var, int i10, int i11) {
        this.f20676b.add(new b(b0Var, i10, i11, null, 8));
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    public final void b(e eVar) {
        StringBuilder sb2 = this.f20675a;
        int length = sb2.length();
        sb2.append(eVar.f20699a);
        List list = eVar.f20700b;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) list.get(i10);
                a((b0) dVar.f20685a, dVar.f20686b + length, dVar.f20687c + length);
            }
        }
        List list2 = eVar.f20701c;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                d dVar2 = (d) list2.get(i11);
                this.f20677c.add(new b((s) dVar2.f20685a, length + dVar2.f20686b, length + dVar2.f20687c, null, 8));
            }
        }
        List list3 = eVar.f20702d;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                d dVar3 = (d) list3.get(i12);
                this.f20678d.add(new b(dVar3.f20688d, dVar3.f20686b + length, dVar3.f20687c + length, dVar3.f20685a));
            }
        }
    }

    public final void c(CharSequence charSequence) {
        if (charSequence instanceof e) {
            b((e) charSequence);
        } else {
            this.f20675a.append(charSequence);
        }
    }

    public final void d(String str) {
        this.f20675a.append(str);
    }

    public final void e() {
        ArrayList arrayList = this.f20679e;
        if (!arrayList.isEmpty()) {
            ((b) arrayList.remove(arrayList.size() - 1)).f20657c = this.f20675a.length();
            return;
        }
        throw new IllegalStateException("Nothing to pop.".toString());
    }

    public final void f(int i10) {
        ArrayList arrayList = this.f20679e;
        if (i10 < arrayList.size()) {
            while (arrayList.size() - 1 >= i10) {
                e();
            }
        } else {
            throw new IllegalStateException((i10 + " should be less than " + arrayList.size()).toString());
        }
    }

    public final void g(String str, String str2) {
        b bVar = new b(str2, this.f20675a.length(), 0, str, 4);
        ArrayList arrayList = this.f20679e;
        arrayList.add(bVar);
        this.f20678d.add(bVar);
        arrayList.size();
    }

    public final int h(b0 b0Var) {
        b bVar = new b(b0Var, this.f20675a.length(), 0, null, 12);
        this.f20679e.add(bVar);
        this.f20676b.add(bVar);
        return r8.size() - 1;
    }

    public final e i() {
        StringBuilder sb2 = this.f20675a;
        String sb3 = sb2.toString();
        ArrayList arrayList = this.f20676b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((b) arrayList.get(i10)).a(sb2.length()));
        }
        ArrayList arrayList3 = null;
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList4 = this.f20677c;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int size2 = arrayList4.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList5.add(((b) arrayList4.get(i11)).a(sb2.length()));
        }
        if (arrayList5.isEmpty()) {
            arrayList5 = null;
        }
        ArrayList arrayList6 = this.f20678d;
        ArrayList arrayList7 = new ArrayList(arrayList6.size());
        int size3 = arrayList6.size();
        for (int i12 = 0; i12 < size3; i12++) {
            arrayList7.add(((b) arrayList6.get(i12)).a(sb2.length()));
        }
        if (!arrayList7.isEmpty()) {
            arrayList3 = arrayList7;
        }
        return new e(arrayList2, arrayList5, arrayList3, sb3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        ?? r82;
        ?? r12;
        boolean z10 = charSequence instanceof e;
        StringBuilder sb2 = this.f20675a;
        if (z10) {
            e eVar = (e) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) eVar.f20699a, i10, i11);
            List b10 = f.b(eVar, i10, i11);
            if (b10 != null) {
                int size = b10.size();
                for (int i12 = 0; i12 < size; i12++) {
                    d dVar = (d) b10.get(i12);
                    a((b0) dVar.f20685a, dVar.f20686b + length, dVar.f20687c + length);
                }
            }
            List list = null;
            String str = eVar.f20699a;
            if (i10 == i11 || (r82 = eVar.f20701c) == 0) {
                r82 = 0;
            } else if (i10 != 0 || i11 < str.length()) {
                ArrayList arrayList = new ArrayList(r82.size());
                int size2 = r82.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Object obj = r82.get(i13);
                    d dVar2 = (d) obj;
                    if (f.c(i10, i11, dVar2.f20686b, dVar2.f20687c)) {
                        arrayList.add(obj);
                    }
                }
                r82 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    d dVar3 = (d) arrayList.get(i14);
                    r82.add(new d(kotlin.ranges.d.f(dVar3.f20686b, i10, i11) - i10, kotlin.ranges.d.f(dVar3.f20687c, i10, i11) - i10, dVar3.f20685a));
                }
            }
            if (r82 != 0) {
                int size4 = r82.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    d dVar4 = (d) r82.get(i15);
                    this.f20677c.add(new b((s) dVar4.f20685a, length + dVar4.f20686b, length + dVar4.f20687c, null, 8));
                }
            }
            if (i10 != i11 && (r12 = eVar.f20702d) != 0) {
                if (i10 != 0 || i11 < str.length()) {
                    ArrayList arrayList2 = new ArrayList(r12.size());
                    int size5 = r12.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        Object obj2 = r12.get(i16);
                        d dVar5 = (d) obj2;
                        if (f.c(i10, i11, dVar5.f20686b, dVar5.f20687c)) {
                            arrayList2.add(obj2);
                        }
                    }
                    r12 = new ArrayList(arrayList2.size());
                    int size6 = arrayList2.size();
                    for (int i17 = 0; i17 < size6; i17++) {
                        d dVar6 = (d) arrayList2.get(i17);
                        r12.add(new d(dVar6.f20688d, kotlin.ranges.d.f(dVar6.f20686b, i10, i11) - i10, kotlin.ranges.d.f(dVar6.f20687c, i10, i11) - i10, dVar6.f20685a));
                    }
                }
                list = r12;
            }
            if (list != null) {
                int size7 = list.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    d dVar7 = (d) list.get(i18);
                    this.f20678d.add(new b(dVar7.f20688d, dVar7.f20686b + length, dVar7.f20687c + length, dVar7.f20685a));
                }
            }
        } else {
            sb2.append(charSequence, i10, i11);
        }
        return this;
    }

    public c(e eVar) {
        this();
        b(eVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) {
        this.f20675a.append(c10);
        return this;
    }
}
