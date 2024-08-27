package d4;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.assetgro.stockgro.prod.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f13724c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f13725a;

    /* renamed from: b, reason: collision with root package name */
    public final a f13726b;

    public c() {
        this(f13724c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f13725a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public e4.k b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f13725a, view);
        if (a10 != null) {
            return new e4.k(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f13725a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, e4.m mVar) {
        this.f13725a.onInitializeAccessibilityNodeInfo(view, mVar.f14996a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f13725a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f13725a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z10;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i11 >= list.size()) {
                break;
            }
            e4.f fVar = (e4.f) list.get(i11);
            if (fVar.a() == i10) {
                e4.y yVar = fVar.f14992d;
                if (yVar != null) {
                    Class cls = fVar.f14991c;
                    if (cls != null) {
                        try {
                            a3.a.u(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z10 = yVar.d(view);
                }
            } else {
                i11++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f13725a, view, i10, bundle);
        }
        if (!z10 && i10 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i13 = 0;
                while (true) {
                    if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                        break;
                    }
                    if (clickableSpan.equals(clickableSpanArr[i13])) {
                        clickableSpan.onClick(view);
                        z11 = true;
                        break;
                    }
                    i13++;
                }
            }
            return z11;
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.f13725a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f13725a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f13725a = accessibilityDelegate;
        this.f13726b = new a(this);
    }
}
