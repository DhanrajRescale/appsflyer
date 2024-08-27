package d4;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.assetgro.stockgro.prod.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f13780d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f13781a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f13782b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f13783c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f13781a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a10 = a(viewGroup.getChildAt(childCount));
                    if (a10 != null) {
                        return a10;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                a3.a.u(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
