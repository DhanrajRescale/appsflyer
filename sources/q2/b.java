package q2;

import android.os.LocaleList;
import java.util.ArrayList;
import mt.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public LocaleList f31575a;

    /* renamed from: b, reason: collision with root package name */
    public d f31576b;

    /* renamed from: c, reason: collision with root package name */
    public final p f31577c = new Object();

    public final d a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f31577c) {
            d dVar = this.f31576b;
            if (dVar != null && localeList == this.f31575a) {
                return dVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new c(new a(localeList.get(i10))));
            }
            d dVar2 = new d(arrayList);
            this.f31575a = localeList;
            this.f31576b = dVar2;
            return dVar2;
        }
    }
}
