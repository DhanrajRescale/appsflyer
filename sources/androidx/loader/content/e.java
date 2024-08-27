package androidx.loader.content;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class e {
    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    d mListener;
    c mOnLoadCanceledListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @NonNull
    public String dataToString(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        hl.f.x(obj, sb2);
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(Object obj) {
        d dVar = this.mListener;
        if (dVar != null) {
            androidx.loader.app.c cVar = (androidx.loader.app.c) dVar;
            cVar.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                cVar.setValue(obj);
            } else {
                cVar.postValue(obj);
            }
        }
    }

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public void forceLoad() {
        onForceLoad();
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public abstract void onForceLoad();

    public void onReset() {
    }

    public abstract void onStartLoading();

    public void onStopLoading() {
    }

    public void registerListener(int i10, @NonNull d dVar) {
        if (this.mListener == null) {
            this.mListener = dVar;
            this.mId = i10;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void registerOnLoadCanceledListener(@NonNull c cVar) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z10 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z10;
        return z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        hl.f.x(this, sb2);
        sb2.append(" id=");
        return nn.d.m(sb2, this.mId, UrlTreeKt.componentParamSuffix);
    }

    public void unregisterListener(@NonNull d dVar) {
        d dVar2 = this.mListener;
        if (dVar2 != null) {
            if (dVar2 == dVar) {
                this.mListener = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public void unregisterOnLoadCanceledListener(@NonNull c cVar) {
        throw new IllegalStateException("No listener register");
    }
}
