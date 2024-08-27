package dv;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14604a;

    /* renamed from: b, reason: collision with root package name */
    public LinkedHashMap f14605b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f14606c;

    public final Map a(Map map) {
        boolean z10;
        LinkedHashMap linkedHashMap;
        String str;
        LinkedHashMap linkedHashMap2 = this.f14605b;
        ArrayList arrayList = this.f14606c;
        if (linkedHashMap2 == null && arrayList == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = this.f14604a;
        if (!z10 && z11) {
            return map;
        }
        if (z11) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (z10) {
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (str3 == null) {
                    linkedHashMap.remove(str2);
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    int indexOf = str3.indexOf("${");
                    int i10 = -1;
                    while (indexOf >= 0 && indexOf < str3.length()) {
                        stringBuffer.append(str3.substring(i10 + 1, indexOf));
                        i10 = str3.indexOf(UrlTreeKt.componentParamSuffix, indexOf);
                        if (i10 > indexOf) {
                            String substring = str3.substring(indexOf + 2, i10);
                            String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (map != null) {
                                str = (String) map.get(substring.toLowerCase());
                            } else {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            if (str != null) {
                                str4 = str.toString();
                            }
                            stringBuffer.append(str4);
                        }
                        indexOf = str3.indexOf("${", Math.max(i10 + 1, indexOf + 1));
                    }
                    stringBuffer.append(str3.substring(i10 + 1));
                    linkedHashMap.put(str2, stringBuffer.toString());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a3.a.u(it.next());
                Iterator it2 = map.entrySet().iterator();
                if (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    throw null;
                }
            }
        }
        return linkedHashMap;
    }
}
