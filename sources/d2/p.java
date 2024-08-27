package d2;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements ViewTranslationCallback {
    public final boolean onClearTranslation(View view) {
        Function0 function0;
        Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        i1.c contentCaptureManager$ui_release = ((a0) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f19318g = 1;
        t.t h10 = contentCaptureManager$ui_release.h();
        Object[] objArr = h10.f34901c;
        long[] jArr = h10.f34899a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            h2.j jVar = ((b3) objArr[(i10 << 3) + i12]).f13370a.f17862d;
                            if (hl.f.m0(jVar, h2.r.f17905y) != null) {
                                Object obj = jVar.f17850a.get(h2.i.f17835k);
                                if (obj == null) {
                                    obj = null;
                                }
                                h2.a aVar = (h2.a) obj;
                                if (aVar != null && (function0 = (Function0) aVar.f17810b) != null) {
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return true;
    }

    public final boolean onHideTranslation(View view) {
        Function1 function1;
        Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        i1.c contentCaptureManager$ui_release = ((a0) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f19318g = 1;
        t.t h10 = contentCaptureManager$ui_release.h();
        Object[] objArr = h10.f34901c;
        long[] jArr = h10.f34899a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            h2.j jVar = ((b3) objArr[(i10 << 3) + i12]).f13370a.f17862d;
                            if (Intrinsics.a(hl.f.m0(jVar, h2.r.f17905y), Boolean.TRUE)) {
                                Object obj = jVar.f17850a.get(h2.i.f17834j);
                                if (obj == null) {
                                    obj = null;
                                }
                                h2.a aVar = (h2.a) obj;
                                if (aVar != null && (function1 = (Function1) aVar.f17810b) != null) {
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return true;
    }

    public final boolean onShowTranslation(View view) {
        Function1 function1;
        Intrinsics.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        i1.c contentCaptureManager$ui_release = ((a0) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.f19318g = 2;
        t.t h10 = contentCaptureManager$ui_release.h();
        Object[] objArr = h10.f34901c;
        long[] jArr = h10.f34899a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            h2.j jVar = ((b3) objArr[(i10 << 3) + i12]).f13370a.f17862d;
                            if (Intrinsics.a(hl.f.m0(jVar, h2.r.f17905y), Boolean.FALSE)) {
                                Object obj = jVar.f17850a.get(h2.i.f17834j);
                                if (obj == null) {
                                    obj = null;
                                }
                                h2.a aVar = (h2.a) obj;
                                if (aVar != null && (function1 = (Function1) aVar.f17810b) != null) {
                                }
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return true;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
