package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import m4.c;
import m4.m;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f1546a = new SparseIntArray(0);

    @Override // m4.c
    public final List a() {
        return new ArrayList(0);
    }

    @Override // m4.c
    public final m b(View view, int i10) {
        if (f1546a.get(i10) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // m4.c
    public final m c(View[] viewArr, int i10) {
        if (viewArr.length == 0 || f1546a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
