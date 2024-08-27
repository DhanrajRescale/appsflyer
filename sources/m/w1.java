package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.assetgro.stockgro.prod.R;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class w1 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f25766a;

    /* renamed from: b, reason: collision with root package name */
    public int f25767b;

    /* renamed from: c, reason: collision with root package name */
    public int f25768c;

    /* renamed from: d, reason: collision with root package name */
    public int f25769d;

    /* renamed from: e, reason: collision with root package name */
    public int f25770e;

    /* renamed from: f, reason: collision with root package name */
    public int f25771f;

    /* renamed from: g, reason: collision with root package name */
    public u1 f25772g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25773h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f25774i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25775j;

    /* renamed from: k, reason: collision with root package name */
    public h4.h f25776k;

    /* renamed from: l, reason: collision with root package name */
    public h.q0 f25777l;

    public w1(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f25766a = new Rect();
        this.f25767b = 0;
        this.f25768c = 0;
        this.f25769d = 0;
        this.f25770e = 0;
        this.f25774i = z10;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i12 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            if (i15 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, makeMeasureSpec);
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0147 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m.w1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f25766a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f25777l != null) {
            return;
        }
        super.drawableStateChanged();
        u1 u1Var = this.f25772g;
        if (u1Var != null) {
            u1Var.f25747b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f25775j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f25774i && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f25774i && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f25774i && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f25774i && this.f25773h) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f25777l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 2;
        if (actionMasked == 10 && this.f25777l == null) {
            h.q0 q0Var = new h.q0(this, i11);
            this.f25777l = q0Var;
            post(q0Var);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 >= 30 && s1.f25717d) {
                        try {
                            s1.f25714a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            s1.f25715b.invoke(this, Integer.valueOf(pointToPosition));
                            s1.f25716c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f25775j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f25771f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        h.q0 q0Var = this.f25777l;
        if (q0Var != null) {
            w1 w1Var = (w1) q0Var.f17731b;
            w1Var.f25777l = null;
            w1Var.removeCallbacks(q0Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f25773h = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, m.u1] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        u1 u1Var = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f25746a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f25746a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f25747b = true;
            u1Var = drawable2;
        }
        this.f25772g = u1Var;
        super.setSelector(u1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f25767b = rect.left;
        this.f25768c = rect.top;
        this.f25769d = rect.right;
        this.f25770e = rect.bottom;
    }
}
