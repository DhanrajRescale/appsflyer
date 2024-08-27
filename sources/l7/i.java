package l7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f24121a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f24122b;

    /* renamed from: c, reason: collision with root package name */
    public final h f24123c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f24124d;

    public i(h hVar, int[] iArr, String[] strArr) {
        this.f24123c = hVar;
        this.f24121a = iArr;
        this.f24122b = strArr;
        if (iArr.length == 1) {
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.f24124d = Collections.unmodifiableSet(hashSet);
            return;
        }
        this.f24124d = null;
    }

    public final void a(String[] strArr) {
        String[] strArr2 = this.f24122b;
        Set set = null;
        if (strArr2.length == 1) {
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (strArr[i10].equalsIgnoreCase(strArr2[0])) {
                    set = this.f24124d;
                    break;
                }
                i10++;
            }
        } else {
            HashSet hashSet = new HashSet();
            for (String str : strArr) {
                int length2 = strArr2.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        String str2 = strArr2[i11];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (hashSet.size() > 0) {
                set = hashSet;
            }
        }
        if (set != null) {
            this.f24123c.b(set);
        }
    }
}
