package w;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f38565a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static /* synthetic */ int a(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            throw null;
        }
        return i10 - i11;
    }

    public static /* synthetic */ boolean b(int i10, int i11) {
        if (i10 != 0) {
            return i10 == i11;
        }
        throw null;
    }

    public static void c(String str, TextView textView, Toast toast, View view) {
        textView.setText(str.toString());
        toast.setView(view);
        toast.show();
    }

    public static /* synthetic */ void d(CoroutineContext.Element element) {
        if (element != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ int e(int i10) {
        if (i10 != 0) {
            return i10 - 1;
        }
        throw null;
    }

    public static /* synthetic */ String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "null" : "Finished" : "BoundReached";
    }

    public static /* synthetic */ int[] g(int i10) {
        int[] iArr = new int[i10];
        System.arraycopy(f38565a, 0, iArr, 0, i10);
        return iArr;
    }
}
