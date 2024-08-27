package m5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f27503a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27504b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27505c;

    /* renamed from: d, reason: collision with root package name */
    public final List f27506d;

    /* renamed from: e, reason: collision with root package name */
    public final List f27507e;

    /* renamed from: f, reason: collision with root package name */
    public final List f27508f;

    public a(long j10, int i10, ArrayList arrayList, List list, List list2, List list3) {
        this.f27503a = j10;
        this.f27504b = i10;
        this.f27505c = Collections.unmodifiableList(arrayList);
        this.f27506d = Collections.unmodifiableList(list);
        this.f27507e = Collections.unmodifiableList(list2);
        this.f27508f = Collections.unmodifiableList(list3);
    }
}
