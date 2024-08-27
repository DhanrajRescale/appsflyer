package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.actions.SearchIntents;
import d4.n1;
import d4.v0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.a3;
import m.b3;
import m.c2;
import m.c3;
import m.d3;
import m.e3;
import m.g3;
import m.h3;
import m.j3;
import m.r;
import m.v2;
import m.w2;
import m.x2;
import m.y2;
import m.z2;
import okhttp3.HttpUrl;
import qu.i0;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements k.c {

    /* renamed from: z0, reason: collision with root package name */
    public static final e3 f1037z0;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;

    /* renamed from: e0, reason: collision with root package name */
    public c3 f1038e0;

    /* renamed from: f0, reason: collision with root package name */
    public View.OnFocusChangeListener f1039f0;

    /* renamed from: g0, reason: collision with root package name */
    public View.OnClickListener f1040g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1041h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f1042i0;

    /* renamed from: j0, reason: collision with root package name */
    public i4.a f1043j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1044k0;

    /* renamed from: l0, reason: collision with root package name */
    public CharSequence f1045l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1046m0;
    public boolean n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f1047o0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f1048p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f1049p0;

    /* renamed from: q, reason: collision with root package name */
    public final View f1050q;

    /* renamed from: q0, reason: collision with root package name */
    public String f1051q0;

    /* renamed from: r, reason: collision with root package name */
    public final View f1052r;

    /* renamed from: r0, reason: collision with root package name */
    public CharSequence f1053r0;

    /* renamed from: s, reason: collision with root package name */
    public final View f1054s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f1055s0;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f1056t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1057t0;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f1058u;

    /* renamed from: u0, reason: collision with root package name */
    public SearchableInfo f1059u0;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f1060v;

    /* renamed from: v0, reason: collision with root package name */
    public Bundle f1061v0;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f1062w;

    /* renamed from: w0, reason: collision with root package name */
    public final w2 f1063w0;

    /* renamed from: x, reason: collision with root package name */
    public final View f1064x;

    /* renamed from: x0, reason: collision with root package name */
    public final w2 f1065x0;

    /* renamed from: y, reason: collision with root package name */
    public h3 f1066y;

    /* renamed from: y0, reason: collision with root package name */
    public final WeakHashMap f1067y0;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f1068z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends r {

        /* renamed from: e, reason: collision with root package name */
        public int f1069e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f1070f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f1071g;

        /* renamed from: h, reason: collision with root package name */
        public final d f1072h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1072h = new d(this);
            this.f1069e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            e3 e3Var = SearchView.f1037z0;
            e3Var.getClass();
            e3.a();
            Method method = e3Var.f25519c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f1069e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // m.r, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1071g) {
                d dVar = this.f1072h;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f1070f;
            searchView.y(searchView.f1042i0);
            searchView.post(searchView.f1063w0);
            if (searchView.f1048p.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1070f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1070f.hasFocus() && getVisibility() == 0) {
                this.f1071g = true;
                Context context = getContext();
                e3 e3Var = SearchView.f1037z0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f1072h;
            if (!z10) {
                this.f1071g = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f1071g = false;
                    removeCallbacks(dVar);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f1071g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1070f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1069e = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, m.e3] */
    static {
        e3 e3Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f25517a = null;
            obj.f25518b = null;
            obj.f25519c = null;
            e3.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                obj.f25517a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                obj.f25518b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f25519c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            e3Var = obj;
        }
        f1037z0 = e3Var;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.f1048p;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // k.c
    public final void c() {
        if (this.f1055s0) {
            return;
        }
        this.f1055s0 = true;
        SearchAutoComplete searchAutoComplete = this.f1048p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1057t0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.n0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1048p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.n0 = false;
    }

    @Override // k.c
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f1048p;
        searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1053r0 = HttpUrl.FRAGMENT_ENCODE_SET;
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f1057t0);
        this.f1055s0 = false;
    }

    public int getImeOptions() {
        return this.f1048p.getImeOptions();
    }

    public int getInputType() {
        return this.f1048p.getInputType();
    }

    public int getMaxWidth() {
        return this.f1047o0;
    }

    public CharSequence getQuery() {
        return this.f1048p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1045l0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f1059u0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f1059u0.getHintId());
            }
            return this.J;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public i4.a getSuggestionsAdapter() {
        return this.f1043j0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1053r0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1061v0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1059u0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1061v0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1048p;
        if (i10 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        e3 e3Var = f1037z0;
        e3Var.getClass();
        e3.a();
        Method method = e3Var.f25517a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        e3Var.getClass();
        e3.a();
        Method method2 = e3Var.f25518b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f1048p;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f1041h0) {
                clearFocus();
                y(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1063w0);
        post(this.f1065x0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int[] iArr = this.B;
            SearchAutoComplete searchAutoComplete = this.f1048p;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.f1068z;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.A;
            rect2.set(i16, 0, i17, i18);
            h3 h3Var = this.f1066y;
            if (h3Var == null) {
                h3 h3Var2 = new h3(rect2, rect, searchAutoComplete);
                this.f1066y = h3Var2;
                setTouchDelegate(h3Var2);
            } else {
                h3Var.f25539b.set(rect2);
                Rect rect3 = h3Var.f25541d;
                rect3.set(rect2);
                int i19 = -h3Var.f25542e;
                rect3.inset(i19, i19);
                h3Var.f25540c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f1042i0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.f1047o0) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.f1047o0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.f1047o0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g3 g3Var = (g3) parcelable;
        super.onRestoreInstanceState(g3Var.f22040a);
        y(g3Var.f25527c);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, k4.b, m.g3] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new k4.b(super.onSaveInstanceState());
        bVar.f25527c = this.f1042i0;
        return bVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f1063w0);
    }

    public final void p(int i10) {
        int i11;
        Uri parse;
        String h10;
        Cursor cursor = this.f1043j0.f19336c;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i12 = j3.f25595x;
                String h11 = j3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h11 == null) {
                    h11 = this.f1059u0.getSuggestIntentAction();
                }
                if (h11 == null) {
                    h11 = "android.intent.action.SEARCH";
                }
                String h12 = j3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h12 == null) {
                    h12 = this.f1059u0.getSuggestIntentData();
                }
                if (h12 != null && (h10 = j3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h12 = h12 + "/" + Uri.encode(h10);
                }
                if (h12 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h12);
                }
                intent = l(h11, parse, j3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), j3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1048p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i10) {
        Editable text = this.f1048p.getText();
        Cursor cursor = this.f1043j0.f19336c;
        if (cursor != null) {
            if (cursor.moveToPosition(i10)) {
                String c10 = this.f1043j0.c(cursor);
                if (c10 != null) {
                    setQuery(c10);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.n0 || !isFocusable()) {
            return false;
        }
        if (!this.f1042i0) {
            boolean requestFocus = this.f1048p.requestFocus(i10, rect);
            if (requestFocus) {
                y(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f1048p;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1038e0 != null) {
                text.toString();
            }
            if (this.f1059u0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1061v0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f1048p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1040g0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1041h0 == z10) {
            return;
        }
        this.f1041h0 = z10;
        y(z10);
        v();
    }

    public void setImeOptions(int i10) {
        this.f1048p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1048p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1047o0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(b3 b3Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1039f0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c3 c3Var) {
        this.f1038e0 = c3Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1040g0 = onClickListener;
    }

    public void setOnSuggestionListener(d3 d3Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1045l0 = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.f1046m0 = z10;
        i4.a aVar = this.f1043j0;
        if (aVar instanceof j3) {
            j3 j3Var = (j3) aVar;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            j3Var.f25604p = i10;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i10;
        this.f1059u0 = searchableInfo;
        Intent intent = null;
        boolean z10 = true;
        SearchAutoComplete searchAutoComplete = this.f1048p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1059u0.getImeOptions());
            int inputType = this.f1059u0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1059u0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            i4.a aVar = this.f1043j0;
            if (aVar != null) {
                aVar.b(null);
            }
            if (this.f1059u0.getSuggestAuthority() != null) {
                j3 j3Var = new j3(getContext(), this, this.f1059u0, this.f1067y0);
                this.f1043j0 = j3Var;
                searchAutoComplete.setAdapter(j3Var);
                j3 j3Var2 = (j3) this.f1043j0;
                if (this.f1046m0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                j3Var2.f25604p = i10;
            }
            v();
        }
        SearchableInfo searchableInfo2 = this.f1059u0;
        boolean z11 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1059u0.getVoiceSearchLaunchWebSearch()) {
                intent = this.H;
            } else if (this.f1059u0.getVoiceSearchLaunchRecognizer()) {
                intent = this.I;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        this.f1049p0 = z11;
        if (z11) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        y(this.f1042i0);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1044k0 = z10;
        y(this.f1042i0);
    }

    public void setSuggestionsAdapter(i4.a aVar) {
        this.f1043j0 = aVar;
        this.f1048p.setAdapter(aVar);
    }

    public final void t() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1048p.getText());
        int i10 = 0;
        if (!z11 && (!this.f1041h0 || this.f1055s0)) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        ImageView imageView = this.f1060v;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void u() {
        int[] iArr;
        if (this.f1048p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f1052r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1054s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean z10 = this.f1041h0;
        SearchAutoComplete searchAutoComplete = this.f1048p;
        if (z10 && (drawable = this.E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        int i10;
        if ((this.f1044k0 || this.f1049p0) && !this.f1042i0 && (this.f1058u.getVisibility() == 0 || this.f1062w.getVisibility() == 0)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f1054s.setVisibility(i10);
    }

    public final void x(boolean z10) {
        int i10;
        boolean z11 = this.f1044k0;
        if (z11 && ((z11 || this.f1049p0) && !this.f1042i0 && hasFocus() && (z10 || !this.f1049p0))) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f1058u.setVisibility(i10);
    }

    public final void y(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.f1042i0 = z10;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f1048p.getText());
        this.f1056t.setVisibility(i10);
        x(!isEmpty);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.f1050q.setVisibility(i11);
        ImageView imageView = this.D;
        if (imageView.getDrawable() != null && !this.f1041h0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        t();
        if (this.f1049p0 && !this.f1042i0 && isEmpty) {
            this.f1058u.setVisibility(8);
            i13 = 0;
        }
        this.f1062w.setVisibility(i13);
        w();
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1068z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        int i11 = 0;
        this.f1063w0 = new w2(this, i11);
        int i12 = 1;
        this.f1065x0 = new w2(this, i12);
        this.f1067y0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        z2 z2Var = new z2(this);
        a3 a3Var = new a3(this, i11);
        c2 c2Var = new c2(this, i12);
        v2 v2Var = new v2(this, i11);
        int[] iArr = g.a.f16369u;
        h.c cVar = new h.c(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
        n1.m(this, context, iArr, attributeSet, (TypedArray) cVar.f17584c, i10);
        LayoutInflater.from(context).inflate(cVar.C(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1048p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1050q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1052r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f1054s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1056t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1058u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1060v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1062w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        v0.q(findViewById, cVar.v(18));
        v0.q(findViewById2, cVar.v(23));
        imageView.setImageDrawable(cVar.v(21));
        imageView2.setImageDrawable(cVar.v(13));
        imageView3.setImageDrawable(cVar.v(10));
        imageView4.setImageDrawable(cVar.v(26));
        imageView5.setImageDrawable(cVar.v(21));
        this.E = cVar.v(20);
        i0.L(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = cVar.C(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = cVar.C(11, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(v2Var);
        searchAutoComplete.setOnEditorActionListener(z2Var);
        searchAutoComplete.setOnItemClickListener(a3Var);
        searchAutoComplete.setOnItemSelectedListener(c2Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new x2(this));
        setIconifiedByDefault(cVar.q(16, true));
        int u10 = cVar.u(2, -1);
        if (u10 != -1) {
            setMaxWidth(u10);
        }
        this.J = cVar.F(12);
        this.f1045l0 = cVar.F(19);
        int z10 = cVar.z(6, -1);
        if (z10 != -1) {
            setImeOptions(z10);
        }
        int z11 = cVar.z(5, -1);
        if (z11 != -1) {
            setInputType(z11);
        }
        setFocusable(cVar.q(1, true));
        cVar.R();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1064x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new y2(this, 0));
        }
        y(this.f1041h0);
        v();
    }
}
