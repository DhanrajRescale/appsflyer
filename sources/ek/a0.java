package ek;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15564a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15565b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15566c;

    public a0(Resources resources, w wVar) {
        this.f15566c = resources;
        this.f15565b = wVar;
    }

    @Override // ek.w
    public final boolean a(Object obj) {
        switch (this.f15564a) {
            case 0:
                Iterator it = ((List) this.f15565b).iterator();
                while (it.hasNext()) {
                    if (((w) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return true;
        }
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, xj.k kVar) {
        v b10;
        Uri uri;
        int i12 = this.f15564a;
        Object obj2 = this.f15565b;
        Object obj3 = this.f15566c;
        switch (i12) {
            case 0:
                List list = (List) obj2;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                xj.g gVar = null;
                for (int i13 = 0; i13 < size; i13++) {
                    w wVar = (w) list.get(i13);
                    if (wVar.a(obj) && (b10 = wVar.b(obj, i10, i11, kVar)) != null) {
                        arrayList.add(b10.f15630c);
                        gVar = b10.f15628a;
                    }
                }
                if (arrayList.isEmpty() || gVar == null) {
                    return null;
                }
                return new v(gVar, new z(arrayList, (c4.e) obj3));
            default:
                Integer num = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj3).getResourcePackageName(num.intValue()) + '/' + ((Resources) obj3).getResourceTypeName(num.intValue()) + '/' + ((Resources) obj3).getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException e10) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((w) obj2).b(uri, i10, i11, kVar);
        }
    }

    public final String toString() {
        switch (this.f15564a) {
            case 0:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.f15565b).toArray()) + UrlTreeKt.componentParamSuffixChar;
            default:
                return super.toString();
        }
    }

    public a0(ArrayList arrayList, c4.e eVar) {
        this.f15565b = arrayList;
        this.f15566c = eVar;
    }
}
