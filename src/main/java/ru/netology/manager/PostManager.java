package ru.netology.manager;

import ru.netology.domain.*;

public class PostManager {
        private LikesInfo likesInfo;
        private ru.netology.domain.CommentsInfo CommentsInfo;
        private CopyRightInfo CopeRightInfo;
        private ru.netology.domain.DonutInfo DonutInfo;
        private ru.netology.domain.GeoInfo GeoInfo;
        private PostSourceInfo PostSourceInfo;
        private RepostsInfo RepostsInfo;

        private void WallSearch() {
                int ownerId;
                int domain;
                int query;
                int ownersOnly;
                int count;
                int offset;
                int extended;
                int fields;
        }

        private void WallDelete(){
                int ownerId;
                int postId;

        }

        public void setLikesInfo(LikesInfo likesInfo) {
                this.likesInfo = likesInfo;
        }

        public void setCommentsInfo(ru.netology.domain.CommentsInfo commentsInfo) {
                CommentsInfo = commentsInfo;
        }

        public void setCoperightInfo(CopyRightInfo copeRightInfo) {
                CopeRightInfo = copeRightInfo;
        }

        public void setDonutInfo(ru.netology.domain.DonutInfo donutInfo) {
                DonutInfo = donutInfo;
        }

        public void setGeoInfo(ru.netology.domain.GeoInfo geoInfo) {
                GeoInfo = geoInfo;
        }

        public void setPostSourceInfo(ru.netology.domain.PostSourceInfo postSourceInfo) {
                PostSourceInfo = postSourceInfo;
        }

        public void setRepostsInfo(ru.netology.domain.RepostsInfo repostsInfo) {
                RepostsInfo = repostsInfo;
        }

        public LikesInfo getLikesInfo() {
                return likesInfo;
        }

        public ru.netology.domain.CommentsInfo getCommentsInfo() {
                return CommentsInfo;
        }

        public CopyRightInfo getCoperightInfo() {
                return CopeRightInfo;
        }

        public ru.netology.domain.DonutInfo getDonutInfo() {
                return DonutInfo;
        }

        public ru.netology.domain.GeoInfo getGeoInfo() {
                return GeoInfo;
        }

        public ru.netology.domain.PostSourceInfo getPostSourceInfo() {
                return PostSourceInfo;
        }

        public ru.netology.domain.RepostsInfo getRepostsInfo() {
                return RepostsInfo;
        }

}