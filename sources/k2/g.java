package k2;

import android.text.Layout;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f21924a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21925b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21926c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f21927d;

    /* renamed from: e, reason: collision with root package name */
    public char[] f21928e;

    public g(Layout layout) {
        this.f21924a = layout;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            int z10 = w.z(this.f21924a.getText(), '\n', i10, false, 4);
            if (z10 < 0) {
                i10 = this.f21924a.getText().length();
            } else {
                i10 = z10 + 1;
            }
            arrayList.add(Integer.valueOf(i10));
        } while (i10 < this.f21924a.getText().length());
        this.f21925b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        this.f21926c = arrayList2;
        this.f21927d = new boolean[this.f21925b.size()];
        this.f21925b.size();
    }

    public final float a(int i10, boolean z10) {
        Layout layout = this.f21924a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        if (z10) {
            return layout.getPrimaryHorizontal(i10);
        }
        return layout.getSecondaryHorizontal(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0115, code lost:
    
        if (r4.getRunCount() == 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        if (r9 == r1.f21923c) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b(int r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.g.b(int, boolean, boolean):float");
    }

    public final int c(int i10, int i11) {
        while (i10 > i11) {
            char charAt = this.f21924a.getText().charAt(i10 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.f(charAt, UserMetadata.MAX_INTERNAL_KEY_SIZE) < 0 || Intrinsics.f(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i10--;
        }
        return i10;
    }
}
