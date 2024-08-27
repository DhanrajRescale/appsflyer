package os;

import android.view.View;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class f0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        return view2.hashCode() - view.hashCode();
    }
}
