package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import jr.h;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {
    private final ImmutableList<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
    private final int importance;
    private final int pid;
    private final String processName;
    private final long pss;
    private final int reasonCode;
    private final long rss;
    private final long timestamp;
    private final String traceFile;

    /* loaded from: classes2.dex */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {
        private ImmutableList<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> buildIdMappingForArch;
        private Integer importance;
        private Integer pid;
        private String processName;
        private Long pss;
        private Integer reasonCode;
        private Long rss;
        private Long timestamp;
        private String traceFile;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo build() {
            String str;
            if (this.pid == null) {
                str = " pid";
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (this.processName == null) {
                str = h.r(str, " processName");
            }
            if (this.reasonCode == null) {
                str = h.r(str, " reasonCode");
            }
            if (this.importance == null) {
                str = h.r(str, " importance");
            }
            if (this.pss == null) {
                str = h.r(str, " pss");
            }
            if (this.rss == null) {
                str = h.r(str, " rss");
            }
            if (this.timestamp == null) {
                str = h.r(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.pid.intValue(), this.processName, this.reasonCode.intValue(), this.importance.intValue(), this.pss.longValue(), this.rss.longValue(), this.timestamp.longValue(), this.traceFile, this.buildIdMappingForArch);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(ImmutableList<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> immutableList) {
            this.buildIdMappingForArch = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i10) {
            this.importance = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i10) {
            this.pid = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str != null) {
                this.processName = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j10) {
            this.pss = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i10) {
            this.reasonCode = Integer.valueOf(i10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j10) {
            this.rss = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j10) {
            this.timestamp = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(String str) {
            this.traceFile = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.pid == applicationExitInfo.getPid() && this.processName.equals(applicationExitInfo.getProcessName()) && this.reasonCode == applicationExitInfo.getReasonCode() && this.importance == applicationExitInfo.getImportance() && this.pss == applicationExitInfo.getPss() && this.rss == applicationExitInfo.getRss() && this.timestamp == applicationExitInfo.getTimestamp() && ((str = this.traceFile) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null)) {
            ImmutableList<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> immutableList = this.buildIdMappingForArch;
            if (immutableList == null) {
                if (applicationExitInfo.getBuildIdMappingForArch() == null) {
                    return true;
                }
            } else if (immutableList.equals(applicationExitInfo.getBuildIdMappingForArch())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public ImmutableList<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch() {
        return this.buildIdMappingForArch;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getPid() {
        return this.pid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public String getProcessName() {
        return this.processName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getPss() {
        return this.pss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getReasonCode() {
        return this.reasonCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getRss() {
        return this.rss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public String getTraceFile() {
        return this.traceFile;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.pid ^ 1000003) * 1000003) ^ this.processName.hashCode()) * 1000003) ^ this.reasonCode) * 1000003) ^ this.importance) * 1000003;
        long j10 = this.pss;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.rss;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.timestamp;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.traceFile;
        int i13 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i14 = (i12 ^ hashCode) * 1000003;
        ImmutableList<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> immutableList = this.buildIdMappingForArch;
        if (immutableList != null) {
            i13 = immutableList.hashCode();
        }
        return i14 ^ i13;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.pid + ", processName=" + this.processName + ", reasonCode=" + this.reasonCode + ", importance=" + this.importance + ", pss=" + this.pss + ", rss=" + this.rss + ", timestamp=" + this.timestamp + ", traceFile=" + this.traceFile + ", buildIdMappingForArch=" + this.buildIdMappingForArch + UrlTreeKt.componentParamSuffix;
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, ImmutableList<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> immutableList) {
        this.pid = i10;
        this.processName = str;
        this.reasonCode = i11;
        this.importance = i12;
        this.pss = j10;
        this.rss = j11;
        this.timestamp = j12;
        this.traceFile = str2;
        this.buildIdMappingForArch = immutableList;
    }
}
