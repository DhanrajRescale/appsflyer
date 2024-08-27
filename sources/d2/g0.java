package d2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class g0 extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13418a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13419b;

    public g0(e4.k kVar) {
        this.f13419b = kVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        switch (this.f13418a) {
            case 0:
                ((r0) this.f13419b).j(i10, accessibilityNodeInfo, str, bundle);
                return;
            default:
                super.addExtraDataToAccessibilityNodeInfo(i10, accessibilityNodeInfo, str, bundle);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        if (d2.w0.k(r9.f17861c, h2.n.f17855b) == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        if (r12.f17851b != false) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0add  */
    /* JADX WARN: Type inference failed for: r3v80, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v82, types: [vt.i0] */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v87, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v88, types: [java.util.ArrayList] */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r37) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.g0.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f13418a) {
            case 1:
                ((e4.k) this.f13419b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f13418a) {
            case 0:
                return createAccessibilityNodeInfo(((r0) this.f13419b).f13588n);
            default:
                return super.findFocus(i10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x059e, code lost:
    
        if (r1 != 16) goto L384;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0060. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0170 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x06b4  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r7v28, types: [d2.e, d2.b] */
    /* JADX WARN: Type inference failed for: r7v31, types: [d2.d, d2.b] */
    /* JADX WARN: Type inference failed for: r7v34, types: [d2.f, d2.b] */
    /* JADX WARN: Type inference failed for: r9v11, types: [d2.h, d2.b] */
    /* JADX WARN: Type inference failed for: r9v7, types: [d2.b, d2.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x016d -> B:80:0x016e). Please report as a decompilation issue!!! */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performAction(int r19, int r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.g0.performAction(int, int, android.os.Bundle):boolean");
    }

    public g0(r0 r0Var) {
        this.f13419b = r0Var;
    }
}
