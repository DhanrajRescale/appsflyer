package m5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f27547a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27548b;

    /* renamed from: c, reason: collision with root package name */
    public final List f27549c;

    /* renamed from: d, reason: collision with root package name */
    public final List f27550d;

    public h(String str, long j10, ArrayList arrayList, List list) {
        this.f27547a = str;
        this.f27548b = j10;
        this.f27549c = Collections.unmodifiableList(arrayList);
        this.f27550d = Collections.unmodifiableList(list);
    }
}
