package d2;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class p0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13564b;

    public /* synthetic */ p0(Object obj, int i10) {
        this.f13563a = i10;
        this.f13564b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f13563a;
        Object obj3 = this.f13564b;
        switch (i10) {
            case 0:
                int compare = ((Comparator) obj3).compare(obj, obj2);
                if (compare == 0) {
                    return xt.a.a(Integer.valueOf(((h2.o) obj).f17865g), Integer.valueOf(((h2.o) obj2).f17865g));
                }
                return compare;
            case 1:
                return ((c3.g) obj).f7929b - ((c3.g) obj2).f7929b;
            case 2:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 3:
            default:
                return ((lr.e) obj).f25103d - ((lr.e) obj2).f25103d;
            case 4:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo == 0) {
                    int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                    if (compareTo2 == 0) {
                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
                    }
                    return compareTo2;
                }
                return compareTo;
        }
    }
}
