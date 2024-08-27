package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final DataBinderMapperImpl f27474a = new DataBinderMapperImpl();

    public static m a(ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        DataBinderMapperImpl dataBinderMapperImpl = f27474a;
        if (i12 == 1) {
            return dataBinderMapperImpl.b(viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return dataBinderMapperImpl.c(viewArr, i11);
    }

    public static m b(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10) {
        boolean z11;
        int i11 = 0;
        if (viewGroup != null && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i10, viewGroup, z10);
        if (z11) {
            return a(viewGroup, i11, i10);
        }
        return f27474a.b(inflate, i10);
    }
}
